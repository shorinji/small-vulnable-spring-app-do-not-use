/**
 * @name param forbidden
 * @kind problem
 * @problem.severity warning
 * @id java/example/fredrik
 */

import java

from Variable v
where v.getName() = "param"
select v, "variable name 'param' is forbidden"