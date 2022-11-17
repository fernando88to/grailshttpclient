package client

import com.fernando.dto.User
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@CompileStatic
@Client('https://jsonplaceholder.typicode.com/')
interface UsersClient {

    /*@Get("/search?limit=25&media=music&entity=album&term={term}")
    SearchResult search(String term)*/

    @Get("/users")
    List<User> getAll()

}