//
List<String> test1 = ["a", "b", "c", "d"]
println test1

//
List<Integer> test2 = [1, 2, 3, 4]
println test2

//
List<Boolean> test3 = [true, false, true, true, false]
println test3

//List cua list
List<List<String>> test4 = [["a", "b", "c", "d"], ["a1", "b1", "c1", "d1"]]
println test4

List<List<String>> test5 = [["a1", "b1"], ["a2", "b2"]]
println test5

//start index = 0
List test41 = test4[0]
println test41

for (int i=0; i <test4.size(); i++) {
	println test4[i]
}
//add value to list String
test1.add("e")
println test1

//add test 5 to test 4
test4.addAll(test5)
println test4

//remove value
test1.remove("a")
println test1

//remove index
test1.remove(1)
println test1

//replace index
test1.set(0,"update")
println test1

//print tung value
List<List<String>> test6 = [["a", "b", "c", "d"], ["a1", "b1", "c1", "d1"]]
println test6
for (int i=0; i <test6.size(); i++) {
	List temp = test6[i]
	for (int j=0; j<temp.size(); j++) {
		println temp[j]
	}
}

//list cua list HashMap
List<HashMap<String, String>> test7 = [["a" : "a1", "b" : "b1"], ["c" : "c1", "d" : "d1"]]
println test7

//while
List<String> test8 = ["a", "b", "c", "d"]
println test8
int i = 0
while (i < test8.size()) {
	println test8[i]
	i++
}
