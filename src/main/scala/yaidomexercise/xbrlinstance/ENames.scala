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

import eu.cdevreeze.yaidom.core.EName

/**
 * EName constants used in XBRL instances.
 *
 * @author Chris de Vreeze
 */
object ENames {

  import Namespaces._

  val XbrliXbrlEName = EName(XbrliNamespace, "xbrl")
  val XbrliContextEName = EName(XbrliNamespace, "context")
  val XbrliUnitEName = EName(XbrliNamespace, "unit")
  val XbrliEntityEName = EName(XbrliNamespace, "entity")
  val XbrliPeriodEName = EName(XbrliNamespace, "period")
  val XbrliScenarioEName = EName(XbrliNamespace, "scenario")
  val XbrliIdentifierEName = EName(XbrliNamespace, "identifier")
  val XbrliSegmentEName = EName(XbrliNamespace, "segment")
  val XbrliInstantEName = EName(XbrliNamespace, "instant")
  val XbrliStartDateEName = EName(XbrliNamespace, "startDate")
  val XbrliEndDateEName = EName(XbrliNamespace, "endDate")
  val XbrliForeverEName = EName(XbrliNamespace, "forever")
  val XbrliMeasureEName = EName(XbrliNamespace, "measure")
  val XbrliDivideEName = EName(XbrliNamespace, "divide")
  val XbrliNumeratorEName = EName(XbrliNamespace, "numerator")
  val XbrliDenominatorEName = EName(XbrliNamespace, "denominator")
  val XbrliUnitNumeratorEName = EName(XbrliNamespace, "unitNumerator")
  val XbrliUnitDenominatorEName = EName(XbrliNamespace, "unitDenominator")

  val XbrldiExplicitMemberEName = EName(XbrldiNamespace, "explicitMember")
  val XbrldiTypedMemberEName = EName(XbrldiNamespace, "typedMember")

  val LinkSchemaRefEName = EName(LinkNamespace, "schemaRef")
  val LinkLinkbaseRefEName = EName(LinkNamespace, "linkbaseRef")
  val LinkRoleRefEName = EName(LinkNamespace, "roleRef")
  val LinkArcroleRefEName = EName(LinkNamespace, "arcroleRef")
  val LinkFootnoteLinkEName = EName(LinkNamespace, "footnoteLink")
  val LinkFootnoteArcEName = EName(LinkNamespace, "footnoteArc")
  val LinkFootnoteEName = EName(LinkNamespace, "footnote")
  val LinkLocEName = EName(LinkNamespace, "loc")

  val XmlLangEName = EName(XmlNamespace, "lang")

  val XsiNilEName = EName(XsiNamespace, "nil")

  val IdEName = EName("id")
  val ContextRefEName = EName("contextRef")
  val UnitRefEName = EName("unitRef")
  val PrecisionEName = EName("precision")
  val DecimalsEName = EName("decimals")
  val SchemeEName = EName("scheme")
  val DimensionEName = EName("dimension")
}
