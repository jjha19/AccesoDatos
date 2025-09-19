package newspapercrud.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import newspapercrud.dao.model.CredentialsEntity;

@Data
@AllArgsConstructor
public class CredentialsRepository {


    public CredentialsEntity get(String username) {
        //connect DB
        //Send the query SQL and get the answer
        //return the answer
        return new CredentialsEntity("root", "root", 1);
    }
}
