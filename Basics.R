l<-"String l"
print(l)

# Vectors in R are like arrays in c
vec<-c(2,45,2,4,5)
# comment
print(vec)

#Data Frames in R
df<-data.frame(Name=c("Jack","john"),Age=c(5,10),Roll=c(34,53))
print(df)

#Basic Functions in R
mn=mean(c(3,3,3,3,3))
print(mn)

sm=sum(vec)
cat('Sum of NUmber in vec is: ',sm," This is how cat works normal print cant do this\n","mean of vector is: ",mn)

#Plotting in R
x=c(1,2,3,4)
y=c(2,4,6,8)
# for plotting multiple plots at the same time
par(mfrow=c(2,2))# here 2,2 represents row and col respectively
plot(x,y,main="Default plot")
plot(x,y,type='l',main="line plot")
plot(x,y,type="b",main="Line and points plot",xlab="X-axis",ylab='Y-axis')

