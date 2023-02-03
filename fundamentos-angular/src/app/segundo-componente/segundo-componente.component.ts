import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {
    nome = "Nelson";
    dataNascimento = "1995-01-01";
    urlImagem = "/assets/Nelson Piquet.webp";

    mostrarDataNascimento() {
      alert(`A data de nascimento do Nelson é: ${this.dataNascimento}`)
    }
}
