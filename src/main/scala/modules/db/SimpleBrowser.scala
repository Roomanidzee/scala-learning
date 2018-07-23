package modules.db

import modules.abstracts.{Browser, Database}

object SimpleBrowser extends Browser{
  override val database: Database = SimpleDatabase
}
