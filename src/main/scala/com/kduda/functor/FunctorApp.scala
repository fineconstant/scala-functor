package com.kduda.functor

import scala.language.implicitConversions


object FunctorApp extends App {

  implicit val oFunctor: OptionFunctor.type = OptionFunctor
  implicit val lFunctor: ListFunctor.type = ListFunctor
  implicit val CFunctor: ContainerFunctor.type = ContainerFunctor

  /**
    * Uses a functor to extend type M with mapWith function.
    * Map is an example of functor usage
    */
  implicit class enrichWithFunctor[M[_], A](m: M[A]) {
    def mapWith[B](f: A => B)(implicit functor: Functor[M]): M[B] = functor(f)(m)
  }

  println(Option(1).mapWith(x => x * 10))
  println(List(1, 2, 3).mapWith(x => x * 10))
  println(Container(1, 2).mapWith(x => x * 10))
}

