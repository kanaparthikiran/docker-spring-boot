/**
 * 
 */
package com.objectlinx.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kiran
 *
 */

@RestController
@RequestMapping("/rest/docker/objectlinx")
public class ObjectlinxResource {

	@GetMapping
	public String sayHello() {
		return "Hello From Docker";
	}
	
}
