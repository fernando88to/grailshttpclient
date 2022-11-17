package client

import com.fernando.dto.User
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@CompileStatic
@Client('${meucliente.url}')
interface UsersClient {

    @Get("/users")
    List<User> getAll()

}