package com.kduda.functor

object ListFunctor extends Functor[List] {
  override def lift[A, B](f: A => B): List[A] => List[B] = list => list map f
}
