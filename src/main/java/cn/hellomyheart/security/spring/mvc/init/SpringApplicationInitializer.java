package cn.hellomyheart.security.spring.mvc.init;

import cn.hellomyheart.security.spring.mvc.config.ApplicationConfig;
import cn.hellomyheart.security.spring.mvc.config.WebConfig;
import cn.hellomyheart.security.spring.mvc.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @description
 * @className: SpringApplicationInitializer
 * @package: cn.hellomyheart.security.springmvc.init
 * @author: Stephen Shen
 * @date: 2020/10/7 下午4:51
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //spring ,相当于加载applicationContext.xml
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    //ServletContext,相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
