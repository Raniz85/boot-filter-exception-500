package boot.filter

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

import groovy.transform.InheritConstructors

/**
 * @author Raniz
 */
@InheritConstructors
@ResponseStatus(HttpStatus.BAD_REQUEST)
class CustomException extends Exception {
}
