package conta.system.domain.model;

public class Error {

    public static void requiredFieldError (String message){
        throw new BusinessException(message + "it's mandatory.");
    }
    
    public static void nonexistentClientError (String message){
        throw new BusinessException(message + "doesn't exist.");
    }

    public static void insufficientBalanceError(){
        throw new BusinessException("Insufficient balance.");
    }

    public static void accountConflictError(){
        throw new BusinessException("Debit and credit account should be different.");
    }
}
