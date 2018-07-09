package com.kduda.functor

import scala.language.higherKinds


/**
  * Creates a functor that is able to apply a function from A to B on given type
  *
  * @tparam M Type constructor to create functor for
  */
trait Functor[M[_]] {
  def apply[A, B](f: A => B): M[A] => M[B] = lift(f)

  def lift[A, B](f: A => B): M[A] => M[B]
}
