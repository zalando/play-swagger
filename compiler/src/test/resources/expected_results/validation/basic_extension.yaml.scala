package basic_extension.yaml
import play.api.mvc.{Action, Controller}
import play.api.data.validation.Constraint
import de.zalando.play.controllers._
import PlayBodyParsing._
import PlayValidations._

object definitionsValidator {
    import definitions.ErrorModel
    import definitions.ExtendedErrorModel
    class ErrorModelMessageConstraints(override val instance: String) extends ValidationBase[String] {
        override def constraints: Seq[Constraint[String]] =
        Seq()
    }
    class ErrorModelMessageValidator(instance: String) extends RecursiveValidator {
      override val validators = Seq(new ErrorModelMessageConstraints(instance))
    }
    class ErrorModelCodeConstraints(override val instance: Int) extends ValidationBase[Int] {
        override def constraints: Seq[Constraint[Int]] =
        Seq(max(600, false), min(100, false))
    }
    class ErrorModelCodeValidator(instance: Int) extends RecursiveValidator {
      override val validators = Seq(new ErrorModelCodeConstraints(instance))
    }
    class ExtendedErrorModelRootCauseConstraints(override val instance: String) extends ValidationBase[String] {
        override def constraints: Seq[Constraint[String]] =
        Seq()
    }
    class ExtendedErrorModelRootCauseValidator(instance: String) extends RecursiveValidator {
      override val validators = Seq(new ExtendedErrorModelRootCauseConstraints(instance))
    }
    class ErrorModelValidator(instance: ErrorModel) extends RecursiveValidator {
        override val validators = Seq(
            new ErrorModelMessageValidator(instance.message), 
            new ErrorModelCodeValidator(instance.code)
            )
        }
    class ExtendedErrorModelValidator(instance: ExtendedErrorModel) extends RecursiveValidator {
        override val validators = Seq(
            )
        }
    }
