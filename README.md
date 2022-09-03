# BST
BST sinifi ikili arama agaci verilerini uzerinde calisabilmek icin yazilmistir. Ne var ki TreeNode sinifinin degisken uyeleri public tanimlandigi icin BST sinifi kullanilarak ikili arama agaci ozelligi tasimayan ikili agaclar olusturulabilmektedir. Bu durumun iki farkli ornegi Main.java icindeki kodlar incelenerek gorulebilir. BST sinifinda kodlamaniz istenen IsBST() metodu BST sinifindan olusturulan bir objede saklanana ikili agacin ikili arama agaci olup olmadigini kontrol etmektedir.
### Projenin Derlenmesi

Bu proje asagidaki gibi derlenebilir.

```bash
javac TreeNode.java BST.java Main.java
```

### Projenin Calistirilmasi

Size verilen kodlardaki bos metodlar istenildigi sekliyle dolduruldugunda bir onceki adimda derlemis oldugunuz projenizi calistirdiginizda elde edeceginiz termina ciktisi asagidaki gibi olacaktir.

#### Programin Calistirilmasi

```bash
java Main
```

#### Programin Terminal Ciktisi

```bash
Inorder
 -100  4  9  12  45  50  75  100 
PreOrder
9  4  -100  45  12  100  75  50 
PostOrder
-100  4  12  50  75  100  45  9
true
false
true
false
```
