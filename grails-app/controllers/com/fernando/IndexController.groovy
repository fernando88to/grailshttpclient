package com.fernando

import client.UsersClient
import com.fernando.dto.User
import grails.converters.JSON
import groovy.transform.CompileStatic
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.annotation.Client
import org.springframework.beans.factory.annotation.Autowired

@CompileStatic
class IndexController {

    @Autowired
    UsersClient usersClient

    def index() {
        List<User> all = usersClient.getAll()
        //render all as JSON
        respond(all, formats:['json'], status:HttpStatus.OK.getCode())
    }
}
