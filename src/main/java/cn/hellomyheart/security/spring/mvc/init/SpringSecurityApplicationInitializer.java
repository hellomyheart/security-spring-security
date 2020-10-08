package cn.hellomyheart.security.spring.mvc.init;

import cn.hellomyheart.security.spring.mvc.config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @description Spring Security初始化
 * @className: SpringSecurityApplicationInitializer
 * @package: cn.hellomyheart.security.spring.mvc.init
 * @author: Stephen Shen
 * @date: 2020/10/8 下午2:00
 */
public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SpringSecurityApplicationInitializer() {
        //super(WebSecurityConfig.class);
    }

}
