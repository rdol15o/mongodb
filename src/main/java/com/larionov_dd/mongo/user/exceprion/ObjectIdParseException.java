package com.larionov_dd.mongo.user.exceprion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ObjectIdParseException extends Exception{

}
