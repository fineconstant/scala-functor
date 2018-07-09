package com.kduda.functor

object ContainerFunctor extends Functor[Container] {
  override def lift[A, B](f: A => B): Container[A] => Container[B] = container => Container(f(container.a), f(container.b))
}
