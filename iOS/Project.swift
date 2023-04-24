import ProjectDescription
import ProjectDescriptionHelpers

let project = Project(
    name: "Welchs",
    organizationName: "com.team-welchs",
    settings: nil,
    targets: [
        Target(
            name: "Welchs",
            platform: .iOS,
            product: .app,
            bundleId: "com.team-welchs.Welchs",
            deploymentTarget: .iOS(
                targetVersion: "15.0",
                devices: .iphone
            ),
            infoPlist: .file(path: Path("SupportingFiles/Info.plist")),
            sources: ["Sources/**"],
            resources: ["Resources/**"],
            dependencies: [
                .SPM.RxSwift,
                .SPM.Kingfisher,
                .SPM.KeychainSwift,
                .SPM.Moya,
                .SPM.RxCocoa,
                .SPM.SnapKit,
                .SPM.Then,
                .SPM.RxMoya
                ]
            )
    ]
)
