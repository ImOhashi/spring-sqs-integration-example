module "sqs" {
  source   = "./modules/sqs"
  sqs_name = var.sqs_name
}