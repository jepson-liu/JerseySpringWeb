/**
 * Project Name:JerseySpringWeb
 * File Created at Aug 11, 2016
 *
*/

package cn.liuzhiping.service;

import org.springframework.stereotype.Service;

/**
 * {add comment} <br/>
 * Date: Aug 11, 2016 <br/>
 * 
 * @author jepson.liu
 * @version 1.0
 * @since 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {
	public DemoServiceImpl() {
		System.out.println("############## DemoServiceImpl init");
	}

	public String sayHello(String str) {

		return "echo :" + str;
	}

}
