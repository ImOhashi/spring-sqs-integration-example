resource "aws_sqs_queue" "sqs_integration_example" {
  name = var.sqs_name
}