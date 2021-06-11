<template>
  <div>
    <header id="botao-superior">
      <button type="button" class="btn btn-success">+ Novo</button>
      <button type="button" class="btn btn-danger">Excluir</button>
    </header>

    <div class="gerenciar_produto">
      <h4>Gerenciar Produto</h4>
       <input class="InputP" type="text" placeholder="Pesquisar nome do produto"/>
        <button type="button" class="btn btn-primary">Pesquisar</button>
     
      <div class="custom-table-responsive coolTable" id="checkboxes">
        <table class="table custom-table">
          <thead>
            <tr>
              <th scope="col">SELECT</th>
              <th scope="col">CÓDIGO</th>
              <th scope="col">NOME</th>
              <th scope="col">PREÇO</th>
              <th scope="col">CATEGORIA</th>
              <th scope="col">STATUS</th>
              <th scope="col">OPÇÕES</th>
            </tr>
          </thead>

          <tbody>
            <td class="center">
              <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
              </label>
            </td>

            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>
              <button type="button" class="btn btn-info">Editar</button>
              <button type="button" class="btn btn-warning">Excluir</button>
            </td>
          </tbody>
        </table>

        <nav aria-label="Page navigation example">
          <ul class="pagination">
            <li class="page-item">
              <a class="page-link" href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
              </a>
            </li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item">
              <a class="page-link" href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
              </a>
            </li>
          </ul>
        </nav>
      </div>
    </div>
  </div>
</template>

<script>
import Produtos from "./services/Produtos";

export default {
  data() {
    return {
      produtos: [],
    };
  },

  mounted() {
    Produtos.listar().then((response) => {
      this.produtos = response.data;
      console.log(response.data);
    });
  },
};
</script>

<style scoped>
header {
  background-color: rgb(244, 244, 252);
  margin: 20px;
}
.gerenciar_produto {
  background-color: rgb(244, 244, 252);
  margin: 20px;
}

h4 {
  margin: 30px;
  display: inline-block;
}

.InputP {
  display: inline-block;
  margin-left: 400px;
  border-radius: 5px;
  border: none;
  border: 1px solid #000000;
}

.pesq {
  cursor: pointer;
  padding: 5px;
  outline: none;
  display: inline-block;
 
}
</style>
    

