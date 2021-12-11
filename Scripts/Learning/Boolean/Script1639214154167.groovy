import org.apache.commons.lang.BooleanUtils

//khai bao biến
Boolean test1 = true
println test1

Boolean test2 = false
println test2

// đổi sang integer
int a = BooleanUtils.toInteger(test1)
println a

int b = BooleanUtils.toInteger(test2)
println b

