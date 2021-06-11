import {http} from './config';

export default{

    //Caminho Principal
    listar: () => {
        return http.get('/produtos');
    }


}