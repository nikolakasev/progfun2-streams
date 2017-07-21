
val v2 = Vector(Vector('o', 'o', 'o', '-', '-', '-', '-', '-', '-', '-'), Vector('o', 'S', 'o', 'o', 'o', 'o', '-', '-', '-', '-'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '-'), Vector('-', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('-', '-', '-', '-', '-', 'o', 'o', 'T', 'o', 'o'), Vector('-', '-', '-', '-', '-', '-', 'o', 'o', 'o', '-'))


val l = List(1,2,3,4)

1 :: l

def streamRange(lo: Int, hi: Int): Stream[Int] =
  if(lo >= hi) Stream.empty
  else lo #:: streamRange(lo + 1, hi)

streamRange(1, 10).tail

List(1,2,3).toStream





















