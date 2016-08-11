/**
 * Project Name:JerseySpringWeb
 * File Created at Aug 11, 2016
 *
*/

package cn.liuzhiping.resource;

import java.util.Date;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.liuzhiping.service.DemoService;

/**
 * {add comment} <br/>
 * Date: Aug 11, 2016 <br/>
 * 
 * @author jepson.liu
 * @version 1.0
 * @since 1.0
 */
@Component
@Scope("prototype")
@Path("/demo")
public class DemoResource {
	@Autowired
	private DemoService demoService;


	@GET
	@Path("/hello/{str}")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getHello(@PathParam("str") String str) {
		return demoService.sayHello(new Date() + " " + str);
	}

}
