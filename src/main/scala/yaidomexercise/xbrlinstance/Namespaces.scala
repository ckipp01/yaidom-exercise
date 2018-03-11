/*
 * Copyright 2011-2018 Chris de Vreeze
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package yaidomexercise.xbrlinstance

/**
 * Namespaces used in XBRL instances.
 *
 * @author Chris de Vreeze
 */
object Namespaces {

  /** Namespace of xml:base, xml:lang etc. */
  val XmlNamespace = "http://www.w3.org/XML/1998/namespace"

  val XsNamespace = "http://www.w3.org/2001/XMLSchema"
  val XsiNamespace = "http://www.w3.org/2001/XMLSchema-instance"
  val XLinkNamespace = "http://www.w3.org/1999/xlink"
  val LinkNamespace = "http://www.xbrl.org/2003/linkbase"
  val XbrliNamespace = "http://www.xbrl.org/2003/instance"
  val XbrldiNamespace = "http://xbrl.org/2006/xbrldi"
}
