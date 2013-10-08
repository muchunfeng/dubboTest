package com.yanglu.dubboTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yougou.component.area.api.IAreaApi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});
    	IAreaApi areaApi = (IAreaApi)cxt.getBean("areaApi");
    	System.out.println("接口获得area = " + areaApi.getAreaByNo("root-20-3-7"));
    }
}
