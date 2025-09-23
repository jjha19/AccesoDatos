package newspapercrud.dao.Basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import newspapercrud.dao.model.CredentialRepository;
import newspapercrud.dao.model.CredentialsEntity;

import java.util.List;

@Data
@AllArgsConstructor
public class BasicCredentialsRepository implements CredentialRepository {


    public CredentialsEntity get(String username) {
        }

    @Override
    public List<CredentialsEntity> getAll() {
        return List.of();
    }

    @Override
    public CredentialsEntity get(String username, String password) {
        //connect DB
        //Send the query SQL and get the answer
        //return the answer
        return new CredentialsEntity("root", "root", 1);
    }

    @Override
    public int save(CredentialsEntity credential) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public void update(CredentialsEntity credential) {

    }
}
