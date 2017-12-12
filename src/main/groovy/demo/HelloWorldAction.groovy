package demo

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.apache.struts.action.Action
import org.apache.struts.action.ActionForm
import org.apache.struts.action.ActionForward
import org.apache.struts.action.ActionMapping

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@CompileStatic
@Slf4j
class HelloWorldAction extends Action {

    @Override
    ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {
        log.debug 'The execute action was invoked...'
        HelloWorldForm hwForm = (HelloWorldForm) form
        hwForm.message = 'Hello There From A Struts Action'
        mapping.findForward('success')
    }
}
