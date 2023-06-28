package conta.system.domain.model;

public class BusinessException extends RuntimeException{

//    Classe de negócio que vai representar um erro.
    public BusinessException(String message){
        super(message);
    }

}
