import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';

import { Curso } from './curso';

@Injectable({
  providedIn: 'root'
})
export class CursoService {

  //URL
  url = "http://localhost/api/php/";

  //Vetor
  vetor: Curso[] = [];

  //Construtor
  constructor(private http: HttpClient) { }


  //Obter todos os cursos
  obterCursos(): Observable<Curso[]> {
    return this.http.get<{cursos: Curso[]}>(this.url + "listar").pipe(
      map((res) => {
        this.vetor = res.cursos;
        return this.vetor;
      })
    )
  }

}
