package newspapercrud.dao.model;

import java.util.List;

public interface CredentialRepository {

    List<CredentialsEntity> getAll();

    CredentialsEntity get(String username, String password);;

    int save(CredentialsEntity credential);

    boolean delete(int id);

    void update(CredentialsEntity credential);


}
