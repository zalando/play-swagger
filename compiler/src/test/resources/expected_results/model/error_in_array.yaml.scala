package error_in_array
package object yaml {
import java.util.Date
import java.io.File

type MetaCopyright = Option[String]

    type ErrorsErrorsOpt = scala.collection.Seq[Error]

    type ModelSchemaSpecialDescriptions = Option[ModelSchemaAgeGroups]

    type ModelSchemaRootLinks = Option[Links]

    type ErrorSource = Option[ErrorSourceNameClash]

    type ModelSchemaAgeGroups = scala.collection.Seq[String]

    type ModelSchemaRootData = Option[ModelSchema]

    type ErrorsErrors = Option[ErrorsErrorsOpt]

    type ModelSchemaRootMeta = Option[Meta]

    type SchemaModelGetResponses200 = Option[ModelSchemaRoot]

    case class ModelSchemaRoot(data: ModelSchemaRootData, meta: ModelSchemaRootMeta, links: ModelSchemaRootLinks) 

    case class Errors(errors: ErrorsErrors) 

    case class ErrorSourceNameClash(pointer: MetaCopyright, parameter: MetaCopyright) 

    case class Meta(copyright: MetaCopyright) 

    case class ModelSchema(name: String, sizeRegister: String, brand: String, partnerArticleModelId: Int, silhouetteId: String, description: MetaCopyright, ageGroups: ModelSchemaAgeGroups, keywords: MetaCopyright, lengthRegister: MetaCopyright, specialDescriptions: ModelSchemaSpecialDescriptions, articleModelAttributes: ModelSchemaSpecialDescriptions) 

    case class Error(source: ErrorSource, code: MetaCopyright, status: MetaCopyright, detail: MetaCopyright, title: MetaCopyright) 

    case class Links(self: MetaCopyright, related: MetaCopyright) 

    

}
