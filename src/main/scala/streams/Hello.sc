import streams.Bloxorz

val v2 = Vector(Vector('o', 'o', 'o', '-', '-', '-', '-', '-', '-', '-'), Vector('o', 'S', 'o', 'o', 'o', 'o', '-', '-', '-', '-'), Vector('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '-'), Vector('-', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'), Vector('-', '-', '-', '-', '-', 'o', 'o', 'T', 'o', 'o'), Vector('-', '-', '-', '-', '-', '-', 'o', 'o', 'o', '-'))


val l = List(1, 2, 3, 4)

1 :: l

def streamRange(lo: Int, hi: Int): Stream[Int] =
  if (lo > hi) Stream.empty
  else lo #:: streamRange(lo + 1, hi)

streamRange(1, 10).tail

List(1, 2, 3).toStream

def from(n: Int): Stream[Int] = n #:: from(n + 1)

from(9).tail

l.filterNot(_ < 2)

Set(1,2,3,4) + 5

streamRange(1, 4).toList

val s = streamRange(1, 4) #::: streamRange(5, 7) #::: streamRange(8, 19)

s.toList

val more = for {
  n <- 1 to 2
} yield streamRange(n*2, n*3)





















