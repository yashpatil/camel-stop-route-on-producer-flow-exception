package nz.section6.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by yash on 21/07/15.
 */
public class MyExceptionThrower implements Processor {


    private String msg;

    @Override
    public void process(Exchange exchange) throws Exception {
        throw new IllegalArgumentException(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
