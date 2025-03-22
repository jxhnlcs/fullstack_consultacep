import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CepResponse } from '../models/cep-response.model';

@Injectable({
  providedIn: 'root'
})
export class CepService {
  private apiUrl = 'http://localhost:8080/api/cep';

  constructor(private http: HttpClient) {}

  buscarCep(cep: string): Observable<CepResponse> {
    return this.http.get<CepResponse>(`${this.apiUrl}/${cep}`);
  }
}