import java

from Variable v
where v.getName() = "param"
select v, "variable name 'param' is forbidden"