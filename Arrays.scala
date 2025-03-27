object Arrays{
    def main(args:Array[String]):Unit={
        //var i=0;
        //var j=0;
        //Array intialized directly
        println("1D Array")
        var x=Array(3,1,4)
        for(i<-0 to 2)
            print(x(i)+" ");
        
        println("\n2D Array")
        //2D array
        var y=Array(Array(4,1,3),Array(5,3,6))
        for(i<-0 to 1){
            for(j<-0 to 2)
                print(y(i)(j)+" ")
            println()   
        }
        
        //Runtime Single Dimension Array
        println("Enter the no.of Element of 1D array: ")
        val n=scala.io.StdIn.readLine.toInt;
        var arr=new Array[Int](n);
        println("Enter the array Elements one by one: ")
        for(i<-0 to n-1)
            arr(i)=scala.io.StdIn.readLine.toInt;
        println("1D run time Array is: ")
        for(i<-0 to n-1)
            print(arr(i)+" ")
        
        //Runtime 2D array
        println("\nEnter the rows and cols of 2d Array one by one: ")
        val r=scala.io.StdIn.readLine.toInt;
        val c=scala.io.StdIn.readLine.toInt;
        var arr1=Array.ofDim[Int](r,c);

        println("Enter the array Elements one by one")
        for(i<-0 to r-1)
            for(j<-0 to c-1)
                arr1(i)(j)=scala.io.StdIn.readLine.toInt
        println("2D array is: ")
        for(i<-0 to r-1){
            for(j<-0 to c-1)
                print(arr1(i)(j)+" ")
            println()   
        }
        
        //Runtime 3D multidimensional Array
        println("\nEnter the dimensions (x, y, z) of the 3D array one by one: ")
        val d= scala.io.StdIn.readLine.toInt
        val  r1= scala.io.StdIn.readLine.toInt
        val  c1= scala.io.StdIn.readLine.toInt
        var arr2 = Array.ofDim[Int](d, r1, c1) // 3D array declaration

        println("Enter the array elements one by one:")
        for (i <- 0 until d) {
        for (j <- 0 until r1) {
            for (k <- 0 until c1) {
            print(s"Element ($i, $j, $k): ") // Optional for better UI
            arr2(i)(j)(k) = scala.io.StdIn.readLine.toInt
            }
        }
        }

        println("3D array is:")
        for (i <- 0 until d) {
        for (j <- 0 until r1) {
            for (k <- 0 until c1) {
            print(arr2(i)(j)(k) + " ")
            }
            println() // Add a newline after every layer (z-dimension)
        }
        println() // Add an extra newline after each x-layer
        }

        
    }
}