package com.kduda.functor

object OptionFunctor extends Functor[Option] {
  override def lift[A, B](f: A => B): Option[A] => Option[B] = optional => optional.map(f)
}
