package it.unibo.pps.u03

// An ADT: type + module
enum Person:
  case Student(name: String, year: Int)
  case Teacher(name: String, course: String)

object Person:
  def name(p: Person): String = p match
    case Student(n, _) => n
    case Teacher(n, _) => n

import Person.*
import u03.Sequences.*
import u03.Sequences.Sequence.*

// a method outside the Person module
def isStudent(p: Person): Boolean = p match
  case Student(_, _) => true
  case _ => false

// Consider Person and Sequence as implemented in class slides
//   .Create a
//   function that takes a sequence of Persons and returns a sequence containing
//   only the courses of Teacher in that list
//   ▶ Hint 1: you essentially need to combine filter and map
//   ▶ Hint 2
// : there is a very concise solution that reuses flatMap


// def getCoursesFromPersonSequence(personSequence: Sequence[Person]): Boolean =
//  filter(personSequence)(p => !isStudent(p))









