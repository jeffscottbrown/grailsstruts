import org.apache.struts.action.ActionServlet
import org.springframework.boot.web.servlet.ServletRegistrationBean

// Place your Spring DSL code here
beans = {

    strutsActionServlet(ServletRegistrationBean) {
        servlet = new ActionServlet()
        urlMappings = ['*.do']
        initParameters = [config: '/WEB-INF/struts-config.xml']
    }

}
