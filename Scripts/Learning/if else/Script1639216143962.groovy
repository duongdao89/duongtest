//1 : CN
//2 : t2
//3 : t3
//4 : t4
//5 : t5
//6 : t6
//7 : t7

int i = 1
String result = ""
if (i==1) {
	result = "CN"
}
else if (i==2) {
	result = "t2"
}
else if (i==3) {
	result = "t3"
}
else if (i==4) {
	result = "t4"
}
else if (i==5) {
	result = "t5"
}
else if (i==6) {
	result = "t6"
}
else if (i==7) {
	result = "t7"
}

Boolean bool = true
String res = bool == true? 1:0
println res

//switch
int i = 1
String result = ""
switch (i) {
	case 1:
		result = "CN"
		break
	case 2:
		result = "t2"
		break
}
println result