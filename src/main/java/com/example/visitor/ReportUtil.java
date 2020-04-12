package com.example.visitor;

/**
 * @Author: peili.wang
 * @Date: 2020/4/12 17:44
 * @Description:
 */
public class ReportUtil {
    public void visit(BaseStaff staff) {
        VisitorImpl visitor = new VisitorImpl();
        if (staff instanceof Engineer) {
            visitor.visit((Engineer) staff);
        } else if (staff instanceof Manager) {
            visitor.visit((Manager) staff);
        }
    }
}
