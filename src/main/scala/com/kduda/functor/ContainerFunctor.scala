package com.kduda.functor

object ContainerFunctor extends Functor[Container] {
  override def apply[A, B](f: A => B): Container[A] => Container[B] = container => Container(f(container.a), f(container.b))
}
