import { Component } from '@angular/core';
import { CepService } from '../../services/cep.service';
import { CepResponse } from '../../models/cep-response.model';

@Component({
  selector: 'app-cep-form',
  templateUrl: './cep-form.component.html',
})
export class CepFormComponent {
  cep: string = '';
  dados: CepResponse | null = null;
  erro: boolean = false;

  constructor(private cepService: CepService) {}

  buscar(): void {
    if (this.cep.trim().length < 8) return;

    this.cepService.buscarCep(this.cep).subscribe({
      next: (res) => {
        this.dados = res;
        this.erro = false;
      },
      error: () => {
        this.erro = true;
        this.dados = null;
      }
    });
  }
}