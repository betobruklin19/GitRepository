import { http } from './config';

export default {

    //Caminho Principal
    listar: () => {
        return http.get('/produtos');
    },

    //Criar e salvar novos Produtos
    salvar: (produto) => {
        return http.post('/produto', produto);
    },
    create(produto) {
        return http.post("/produto", produto);
    },
    //Apagar pelo Id
    deleteProduto(id) {
        return http.delete(`/produto/${id}`);
    },

    //Apagar todos os Produtos
    apagarTodos: () => {
        return http.delete('/produto');

    },
     // Atualizar Produto
    atualizar: (id, produto) => {
        return http.put(`/produto/${id}`, produto);
    },

    // Enum Categoria
    ListCateg: () => {
        return http.get('/Categorias');

    },

    // Enum Status
    ListStatus: () => {
        return http.get('/Status');
    },

    // Buscar pelo Nome
    findByName(nome) {
        return http.get(`/produtos?name=${nome}`);
      },

    updateProduto(id, data) {
        return http.put(`/produtos/${id}`, data);
      }
}