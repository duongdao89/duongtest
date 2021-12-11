//bao gồm những cặp key-value
Map map1 = ["1" : "aaaa", "2" : "bbbbb", "3" : "ccccc"]
print map1

//add value to map1
map1.put("4", "dddddd")
print map1


//khai báo map2, sau đó add map2 vào map 1
Map map2 = ["5" : "eeee", "6" : "ffffff", "7" : "ggggg"]
map1.putAll(map2)
print map1

//replace value
map1.replace("1", "update")
print map1

//remove value
map1.remove("1")
print map1