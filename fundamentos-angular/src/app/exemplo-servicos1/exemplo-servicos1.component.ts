import { LoggerService } from './../logger.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-exemplo-servicos1',
  templateUrl: './exemplo-servicos1.component.html',
  styleUrls: ['./exemplo-servicos1.component.css']
})
export class ExemploServicos1Component {
  nome = "";

  constructor(private logger: LoggerService) {

  }
  adicionarNome() {
    this.logger.logar(`O nome do produto ${this.nome} foi adicionado`);
  }
}
